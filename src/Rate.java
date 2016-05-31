import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rate")
public class Rate {

    public String id;

    @XmlElement()
    public String Name;

    @XmlElement()
    public double Rate;
    public String Date;
    public String Time;

    @XmlElement()
    public String Ask;

    @XmlElement()
    public String Bid;

    public String toString(){
        return Name + ": " + Rate + " with bid: " + Bid + " and ask: " + Ask;
    }


}
