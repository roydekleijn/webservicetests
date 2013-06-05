package pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ActueleVertrekTijden")
public class ActueleVertrekTijden {

    private List<VertrekkendeTrein> vertrekkendeTrein;

    @XmlElement(name = "VertrekkendeTrein")
    public List<VertrekkendeTrein> getVertrekkendeTrein() {
        return vertrekkendeTrein;
    }

    public void setVertrekkendeTrein(List<VertrekkendeTrein> vertrekkendeTrein) {
        this.vertrekkendeTrein = vertrekkendeTrein;
    }

}
