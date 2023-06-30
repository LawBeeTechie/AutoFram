package com.api.pojo;

public class JobAssignmentRequestBodyPojo {
	private int job_id;
	private int engineer_id;
	public JobAssignmentRequestBodyPojo(int job_id, int engineer_id) {
		super();
		this.job_id = job_id;
		this.engineer_id = engineer_id;
	}
	
	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
	}

	@Override
	public String toString() {
		return "JobAssignmentRequestBodyPojo [job_id=" + job_id + ", engineer_id=" + engineer_id + "]";
	}
	
	
}
