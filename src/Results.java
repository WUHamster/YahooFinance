import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result")
public class Results {

    @XmlElement()
    public Rate[] rates;

    public void setRate(Rate[] rate) {
        this.rates = rate;
    }

    public Rate[] getRate() {
        return rates;
    }

    public void printRates() {
        for (Rate r: rates) {
            System.out.println(r);
        }
    }
}
