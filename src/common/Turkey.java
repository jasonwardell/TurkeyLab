package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author jwardell
 */
public class Turkey implements Comparable{
    private String weight;
    private String turkeyId;
    private String brand;

    public Turkey(String weight, String turkeyId, String brand) {
        this.weight = weight;
        this.turkeyId = turkeyId;
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.turkeyId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (!Objects.equals(this.turkeyId, other.turkeyId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turkey{" + "weight=" + weight + ", turkeyId=" + turkeyId + ", brand=" + brand + '}';
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTurkeyId() {
        return turkeyId;
    }

    public void setTurkeyId(String turkeyId) {
        this.turkeyId = turkeyId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Object other) {
        Turkey o = (Turkey)other;
        
        return new CompareToBuilder()
               .append(this.turkeyId, o.turkeyId)
               .toComparison();
    }
    
    
}
