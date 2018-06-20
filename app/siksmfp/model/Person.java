package siksmfp.model;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;

    public String name;
}
