package model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String name;
    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne
    @JoinColumn(name = "specie_id")
    private Specie specie;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPlace(Place place){
        this.place = place;
    }

    public Place getPlace(){
        return place;
    }

    public void setSpecie(Specie specie){
        this.specie = specie;
    }

    public Specie getSpecie(){
        return specie;
    }
}
