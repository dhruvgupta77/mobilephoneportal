package com.mobilephone.portal.exception;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class ConstraintViolationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String[] fields;
	private Long id;
	private String status;

	private List<Problem> problems;

	public ConstraintViolationException(String cause, String[] fields) {
		super(cause);
		this.fields = fields;
	}

	public ConstraintViolationException(Problem problem) {
		this.problems = Arrays.asList(problem);
	}

	public ConstraintViolationException(List<Problem> problems) {
		this.problems = problems;
	}

	@Getter
	@AllArgsConstructor
	public static class Problem {

		private String fieldName;
		private String ms_template;
		private Object[] replacements;

	}
}