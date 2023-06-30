package com.ui.pojo;

public class ProblemsDetailsPojo {
	private String problem;
	private String remarks;
	public ProblemsDetailsPojo(String problem, String remarks) {
		super();
		this.problem = problem;
		this.remarks = remarks;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "ProblemsDetailsPojo [problem=" + problem + ", remarks=" + remarks + "]";
	}
	

}
