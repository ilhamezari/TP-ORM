package ma.enset.hospital;

import ma.enset.hospital.Service.HospitalServiceI;
import ma.enset.hospital.entities.*;
import ma.enset.hospital.repositories.ConsultationRepository;
import ma.enset.hospital.repositories.MedecinRepository;
import ma.enset.hospital.repositories.PatientRepository;
import ma.enset.hospital.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner{
    @Autowired
    private PatientRepository patientRepo;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    //@Bean
    @Override
    public void run(String... args) throws Exception {
        patientRepo.save(new Patient(null, "Omar", new Date(), false, 60,null));
        patientRepo.save(new Patient(null, "Akram", new Date(), true, 90,null));
    };

}


    /**

    public static void main(String[] args) {

      SpringApplication.run(HospitalApplication.class, args);
    }
@Bean
CommandLineRunner start(HospitalServiceI hospitalServiceI, MedecinRepository medecinRepository, PatientRepository patientRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository){
        /**PatientRepository patientRepository,
        MedecinRepository medecinRepository,
        RendezVousRepository rendezVousRepository,
        ConsultationRepository consultationRepository) {
    return args -> {
        Stream.of("Ahmed", "med", "amal")
                .forEach(name -> {
                    Patient patient = new Patient();
                    patient.setNom(name);
                    patient.setDateNaissance(new Date());
                    patient.setMalade(false);
                    hospitalServiceI.savePatient(patient);
                });
        Stream.of("Omar", "Ali", "Red")
                .forEach(name ->{
                    Medcin medcin = new Medcin();
                    medcin.setNom(name);
                    medcin.setEmail(name+"@gmail.com");
                    medcin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                    hospitalServiceI.saveMedecin(medcin);

                });
Patient patient = patientRepository.findById(1L).orElse(null);
Patient patient1=patientRepository.findByNom("red");

Medcin medcin=medecinRepository.findByNom("Omar");

        RendezVous rendezVous=new RendezVous();
        rendezVous.setDate(new Date());
        rendezVous.setStatus(StatusRDV.PENDING);
        rendezVous.setMedcin(medcin);
        rendezVous.setPatient(patient);
        //rendezVousRepository.save(rendezVous);
        RendezVous saveRDV = hospitalServiceI.saveRDV(rendezVous);
        System.out.println(saveRDV.getId());

        RendezVous rendezVous1 = rendezVousRepository.findAll().get(0);

        Consultation consultation=new Consultation();
        consultation.setDateConsultation(new Date());
        consultation.setRendezVous(rendezVous1);
        consultation.setRapport("Rapport consultation ...");
        hospitalServiceI.saveConsultation(consultation);
    };
}}

    @Override
    public void run(String... args) throws Exception {

    }
}
 **/
