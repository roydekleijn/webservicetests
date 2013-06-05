package pojo;

import javax.xml.bind.annotation.XmlElement;

public class VertrekkendeTrein {

    private String ritNummer;
    private String vertrekTijd;
    private String eindBestemming;
    private String treinSoort;
    private String routeTekst;
    private String vervoerder;
    private String vertrekSpoor;

    @XmlElement(name = "RitNummer")
    public String getRitNummer() {
        return ritNummer;
    }

    @XmlElement(name = "VertrekTijd")
    public String getVertrekTijd() {
        return vertrekTijd;
    }

    @XmlElement(name = "EindBestemming")
    public String getEindBestemming() {
        return eindBestemming;
    }

    @XmlElement(name = "TreinSoort")
    public String getTreinSoort() {
        return treinSoort;
    }

    @XmlElement(name = "RouteTekst")
    public String getRouteTekst() {
        return routeTekst;
    }

    @XmlElement(name = "Vervoerder")
    public String getVervoerder() {
        return vervoerder;
    }

    @XmlElement(name = "VertrekSpoor")
    public String getVertrekSpoor() {
        return vertrekSpoor;
    }

    public void setRitNummer(String ritNummer) {
        this.ritNummer = ritNummer;
    }

    public void setVertrekTijd(String vertrekTijd) {
        this.vertrekTijd = vertrekTijd;
    }

    public void setEindBestemming(String eindBestemming) {
        this.eindBestemming = eindBestemming;
    }

    public void setTreinSoort(String treinSoort) {
        this.treinSoort = treinSoort;
    }

    public void setRouteTekst(String routeTekst) {
        this.routeTekst = routeTekst;
    }

    public void setVervoerder(String vervoerder) {
        this.vervoerder = vervoerder;
    }

    public void setVertrekSpoor(String vertrekSpoor) {
        this.vertrekSpoor = vertrekSpoor;
    }

    /*
     * <RitNummer>9844</RitNummer>
     * <VertrekTijd>2013-06-05T14:05:00+0200</VertrekTijd> <EindBestemming>Den
     * Haag Centraal</EindBestemming> <TreinSoort>Sprinter</TreinSoort>
     * <RouteTekst>Woerden, Gouda, Zoetermeer</RouteTekst>
     * <Vervoerder>NS</Vervoerder> <VertrekSpoor
     * wijziging="false">18a</VertrekSpoor>
     */
}
