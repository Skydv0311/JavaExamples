package commondemos.mockitoJava8;

import java.util.Optional;

public interface JobService {
    Optional<JobPosition> findCurrentJobPosition(Person person);

    default boolean assignJobPosition(Person person,JobPosition jobPosition){
        if(!findCurrentJobPosition(person).isPresent()){
            person.setCurrentJobPosition(jobPosition);
            return true;
        }else{
            return false;
        }
    }
}
