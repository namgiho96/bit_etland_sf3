package com.bit_etland.web.service;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface SequenceService {

	public String arithmeticSequence(Map<?, ?> param);

	public String geometricSequence(Map<?, ?> param);

	public String fibonacciSequence(Map<?, ?> param);

	public String factorialSequence(Map<?, ?> param);

	public String switchSequence(Map<?, ?> param);

}
