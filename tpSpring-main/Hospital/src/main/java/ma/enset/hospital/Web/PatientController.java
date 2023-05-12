package ma.enset.hospital.Web;

import lombok.AllArgsConstructor;
import ma.enset.hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ma.enset.hospital.entities.Patient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@AllArgsConstructor
public class PatientController {
@Autowired
 private PatientRepository patientRep;
 //@RequestMapping
@GetMapping("/index")
 public String index(Model model){
 List<Patient> patientList=patientRep.findAll();
model.addAttribute("listPatients",patientList);
 return "patients";}}
