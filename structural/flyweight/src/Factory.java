import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<String, Job> jobs = new HashMap<>();

    public Job getJob(String job){

        Job j = null;

        if(job == null){
            throw new IllegalArgumentException();
        }

        if(jobs.containsKey(job)){
            return jobs.get(job);
        }

        if(job.equals("Programming")){
            j = new Programming();
            jobs.put(job, j);
        }

        if(job.equals("Accounting")){
            j = new Accounting();
            jobs.put(job, j);
        }

        return j;
    }
}
