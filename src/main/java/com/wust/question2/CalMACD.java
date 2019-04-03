package com.wust.question2;

public class CalMACD {
	public static void macd(float[] inData, int shortTerm, int longTerm, int midTerm,
			float[] outDiff, float[] outDea) {
		float EMA12 = inData[0];
		float EMA26 = inData[0];
		outDiff[0] = 0.0f;
		outDea[0] = 0.0f;
		for(int i = 1; i < inData.length; i++) {
			EMA12 = 2.0f / (shortTerm + 1) * inData[i] + (float)(shortTerm - 1) / (shortTerm + 1) * EMA12;
			EMA26 = 2.0f / (longTerm + 1) * inData[i] + (float)(longTerm - 1) / (longTerm + 1) * EMA26;
			outDiff[i] = EMA12 - EMA26;
			outDea[i] = 2.0f / (midTerm + 1) * outDiff[i] + (float)(midTerm - 1) / (midTerm + 1) * outDea[i-1];
		}
	}
}
