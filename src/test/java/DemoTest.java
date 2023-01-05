import commondemos.mockitoJava8.JobPosition;
import commondemos.mockitoJava8.JobService;
import commondemos.mockitoJava8.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DemoTest {

    @Mock
    JobService jobService;

    @Test
    public void givenDefaultMethod_whenCallRealMethod_thenNoExceptionIsRaised() {
        Person person=new Person();

        when(jobService.findCurrentJobPosition(person)).thenReturn(Optional.of(new JobPosition()));

        doCallRealMethod().when(jobService).assignJobPosition(Mockito.any(Person.class),Mockito.any(JobPosition.class));

        Assert.assertFalse(jobService.assignJobPosition(person,new JobPosition()));
    }

    @Test
    public void givenReturnListsOfTypeOptional_whenDefaultValueIsReturned_thenValueIsEmpty(){
        Person person=new Person();

        when(jobService.findCurrentJobPosition(person)).thenReturn(Optional.empty());

        doCallRealMethod().when(jobService).assignJobPosition(Mockito.any(Person.class),Mockito.any(JobPosition.class));

        Assert.assertTrue(jobService.assignJobPosition(person,new JobPosition()));
    }
}
