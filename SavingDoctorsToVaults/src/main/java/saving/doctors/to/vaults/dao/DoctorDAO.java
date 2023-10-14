package saving.doctors.to.vaults.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import saving.doctors.to.vaults.model.Doctor;

import java.util.List;

@Component
public class DoctorDAO {


   private final JdbcTemplate jdbcTemplate;

   @Autowired
   public DoctorDAO(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
   }


   public List<Doctor> index() {
       return jdbcTemplate.query("SELECT * FROM Doctor", new BeanPropertyRowMapper<>(Doctor.class) );
   }

   public Doctor show(int id) {

      return jdbcTemplate.query("SELECT*FROM Doctor WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Doctor.class))
              .stream().findAny().orElse(null);
   }




   public void save(Doctor doctor) {
     jdbcTemplate.update("INSERT INTO Doctor VALUES(1, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
             doctor.getLastName(), doctor.getFirstSurname(), doctor.getMiddleName(), doctor.getSpecialization(),
             doctor.getLicenseNumber(), doctor.getTelephone(), doctor.getEmail(), doctor.getAddress(),
             doctor.getExperienceYears(), doctor.getWorkSchedule(), doctor.getConsultationFee(),
             doctor.getPatientList(), doctor.getSpecializedServices());
   }




























}
