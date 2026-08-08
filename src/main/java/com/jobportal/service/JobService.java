package com.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.entity.Job;
import com.jobportal.repository.JobRepository;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }
    public Job getJobById(Long id) {
    return jobRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Job not found"));
    }
    public Job updateJob(Long id, Job updatedJob) {

    Job job = jobRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Job not found"));

    job.setTitle(updatedJob.getTitle());
    job.setCompany(updatedJob.getCompany());
    job.setLocation(updatedJob.getLocation());
    job.setDescription(updatedJob.getDescription());
    job.setSalary(updatedJob.getSalary());

    return jobRepository.save(job);
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }
    public void deleteJob(Long id){
        jobRepository.deleteById(id);
    }
}