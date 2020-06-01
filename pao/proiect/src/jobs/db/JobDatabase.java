package jobs.db;

import jobs.model.*;

import java.util.Collection;

public interface JobDatabase {
    void addCompany(Company company);
    void removeCompany(Company company);
    Collection<Company> getCompanies();
    Company findCompanyByName(String name);

    void addJob(Job job);
    Collection<Job> getJobs();

    void addUser(User user);
    Collection<User> getUsers();

    void addCV(CV cv);
    Collection<CV> getCVs(Candidate user);

    void addApplication(Application application);
    void removeApplication(Application application);
    Collection<Application> getApplications(Job job);
}
