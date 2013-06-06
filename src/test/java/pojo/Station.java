package pojo;

import javax.xml.bind.annotation.XmlElement;

public class Station {

    private String name;
    private String code;
    private String country;
    private String latitude;
    private String longitude;
    private String alias;

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "code")
    public String getCode() {
        return code;
    }

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    @XmlElement(name = "lat")
    public String getLatitude() {
        return latitude;
    }

    @XmlElement(name = "long")
    public String getLongitude() {
        return longitude;
    }

    @XmlElement(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

}
