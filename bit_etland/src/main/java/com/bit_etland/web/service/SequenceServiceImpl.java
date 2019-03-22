package com.bit_etland.web.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SequenceServiceImpl implements SequenceService {

	
	/* 등차수열 알고리즘 */
	
	@Override
	public String arithmeticSequence(Map<?, ?> param) {
		String startNum = (String)param.get("start"),
				endNum = (String)param.get("end"),
				diff = (String)param.get("diff"),
				result = "";
		int A = Integer.parseInt(startNum); //첫번째
		int E = Integer.parseInt(endNum); // 마지막번째
		int D = Integer.parseInt(diff); // 공차
		int S = A; 
		int N = 2; // 항의 순서
		int AN= 0;
		while(true) {
			AN = A + (N-1) * D;
			S = S + AN;
			N = N + 1;
			if(N > E) break;
		}
		
		result = String.valueOf(S);
		System.out.println("등차수열 결과값 : "+result);
		return result;
	}

	
	/* 등비 수열 알고리즘*/
	@Override
	public String geometricSequence(Map<?, ?> param) {
		int A = 2;
		int R = 3;
		int S = A;
		int N = 2;
		String result = "";

		while (true) {

			A = A * R;
			S += A;
			N++;
			
			if (N > 100) {
				break;
			}
		}
		result = String.valueOf(S);
		return result;
		
	}

	
	/* 피보나치 수열 알고리즘 */
	@Override
	public String fibonacciSequence(Map<?, ?> param) {
		int A = 1;
        int B = 1;
        int S = A+B;
        int N = 2;
        int C = 0;
    
        while(true){
            
            C = A + B;
            S += C;
            A = B;
            B = C;
            N++;
            System.out.println(
                    "Count is "+(N)+", Number is "+ C +", Sum is "+ S);
            if(N==20){
            	
                break;
            }
            
        }
        
        System.out.println("S is "+ S);     
		return String.valueOf(S);
		
	}

	/* 누승 활용 수열 알고리즘 */
	@Override
	public String factorialSequence(Map<?, ?> param) {
		int S = 1;
        int F = 1;
        int N = 0;
        for (N = 2; N < 11; N++) {
            F = F * N;
            S += F;
            System.out.println("Count is " + (N)
                    + ", Number is " + F
                    + ", Sum is " + S);
        }
		return null;
		
		
	}

	/* 교행 자연수 수열 */
	@Override
	public String switchSequence(Map<?, ?> param) {
		int S = 0;
		int N = 0;
		String ex = "";
		do {
			N++;
			System.out.println("N is " + N);
			S += N;
			System.out.println("합계: " + S);
			ex += "+" + N;
			N++;
			System.out.println("N is " + N);
			S -= N;
			System.out.println("합계: " + S);
			ex += "-" + N;
		} while (N < 19);
		
		System.out.println(ex + " = " + S);
		return null;
	}
		
		
		
	}


