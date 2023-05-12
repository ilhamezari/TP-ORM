package ma.enset.hospital.Service;

import ma.enset.hospital.entities.Consultation;
import ma.enset.hospital.entities.Medcin;
import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.entities.RendezVous;

public interface HospitalServiceI  {
    public Patient savePatient(Patient patient);
    Medcin saveMedecin(Medcin medcin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
