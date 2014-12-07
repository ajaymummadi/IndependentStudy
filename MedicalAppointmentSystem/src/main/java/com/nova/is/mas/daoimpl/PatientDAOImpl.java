package com.nova.is.mas.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nova.is.mas.dao.PatientDAO;
import com.nova.is.mas.mapper.AppointmentMapper;
import com.nova.is.mas.mapper.PatientDetailsRowMapper;
import com.nova.is.mas.mapper.PhysicianMapper;
import com.nova.is.mas.model.AppointmentDO;
import com.nova.is.mas.model.PatientDetailsDO;
import com.nova.is.mas.model.PhysicianDO;

public class PatientDAOImpl implements PatientDAO{

	private JdbcTemplate jdbcTemplate;

	public PatientDAOImpl() {
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void addPatient(PatientDetailsDO patientDetails){

		try {
		String query = "INSERT INTO patientdetails(patient_id, first_name, last_name, sex, marital_status, address, " +
				"city, state, zipcode, phone_number, insurance_provider, height, weight, allergies) VALUES (?,?,?,?,?,?,?,?,?,?,?, ?, ?, ?)";
		Object[] data = {patientDetails.getpId(), patientDetails.getLastName(), patientDetails.getFirstName(), patientDetails.getSex(),
				         patientDetails.getMaritalStatus(), patientDetails.getAddress(), patientDetails.getCity(), patientDetails.getState(), patientDetails.getZipcode(), 
				         patientDetails.getPhoneNumber(), patientDetails.getInsuranceProvider(), patientDetails.getHeight(), 
				         patientDetails.getWeight(), patientDetails.getAllergies()};
		
		jdbcTemplate.update(query, data);
		} catch (Exception e) {
			e.printStackTrace();	
		}

	}


	@SuppressWarnings("unchecked")
	public List<PatientDetailsDO> getPatientList(){
		
		PatientDetailsRowMapper projecDetailsRowMapper = new PatientDetailsRowMapper();
		String query = "select * from patientdetails";
		List<PatientDetailsDO> projectDetailsList = (List<PatientDetailsDO>) jdbcTemplate.query(query, projecDetailsRowMapper);
		return projectDetailsList;

	}

	public PatientDetailsDO getPatientList(PatientDetailsDO projectDetails) {
		PatientDetailsRowMapper projecDetailsRowMapper = new PatientDetailsRowMapper();
		String query = "select * from projectdetails where pId = "+projectDetails.getpId()+"";
		@SuppressWarnings("unchecked")
		PatientDetailsDO projectDetailsDO = (PatientDetailsDO) jdbcTemplate.queryForObject(query, projecDetailsRowMapper);
		return projectDetailsDO;
	}

	@Override
	public void scheduleAppointment(PatientDetailsDO projDetail) {
		
		
	}

	@Override
	public List<PhysicianDO> getPhysicians() {
		PhysicianMapper physicianMapper = new PhysicianMapper();
		String query = "select * from physiciandetails";
		@SuppressWarnings("unchecked")
		List<PhysicianDO> physicianList = (List<PhysicianDO>) jdbcTemplate.query(query, physicianMapper);
		return physicianList;
		
	}

	@Override
	public PatientDetailsDO getPatientName(int pId) {
		PatientDetailsRowMapper projecDetailsRowMapper = new PatientDetailsRowMapper();
		String query = "select * from patientDetails where patient_id = "+pId+"";
		PatientDetailsDO patientDetailsDO = (PatientDetailsDO) jdbcTemplate.queryForObject(query, projecDetailsRowMapper);
		return patientDetailsDO;
	}

	@Override
	public void saveSchedule(String physicianID, String patientID,
			String appointmentType, String day, String date) {
		try {
			String query = "INSERT INTO appointmentdetails values("+physicianID+", "+patientID+", '"+appointmentType+"', '"+day+"', '"+date+"')";
			
			jdbcTemplate.update(query);
			} catch (Exception e) {
				e.printStackTrace();	
			}
		
	}

	@Override
	public List<AppointmentDO> getAppointments(String userName) {
		AppointmentMapper appointmentMapper = new AppointmentMapper();
		String query = "select p.height, p.weight, p.allergies, p.last_name, p.first_name, p.city, p.phone_number, p.insurance_provider, p.sex, p.marital_status," +
				" p.address, p.zipcode, p.patient_id, p.zipcode, p.state, ap.date from APPOINTMENTDETAILS ap," +
				       "patientdetails p, physiciandetails py, login l where " + 
					   "ap.patient_id = p.patient_id and " +
					   "ap.doctorid = py.doctorid and " +
					   "py.user = l.username order by ap.date desc";
		List<AppointmentDO> appointmentList = (List<AppointmentDO>) jdbcTemplate.query(query, appointmentMapper);
		return appointmentList;
	}

	@Override
	public List<PatientDetailsDO> getPatientInfo(int pId) {
		PatientDetailsRowMapper projecDetailsRowMapper = new PatientDetailsRowMapper();
		String query = "select * from patientdetails where patient_id = "+pId+"";
		List <PatientDetailsDO> patientList = (List<PatientDetailsDO>) jdbcTemplate.query(query, projecDetailsRowMapper);
		return patientList;
	}

	@Override
	public List<PatientDetailsDO> getPatientInfo(String firstName, String lastName) {
		PatientDetailsRowMapper projecDetailsRowMapper = new PatientDetailsRowMapper();
		String query = "select * from patientdetails where first_name = '"+firstName+"' and last_name = '"+lastName+"'";
		List<PatientDetailsDO> patientList = (List<PatientDetailsDO>) jdbcTemplate.query(query, projecDetailsRowMapper);
		return patientList;
	}


}
