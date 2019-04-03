package com.wust.question2;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class CalMACDTest extends TestCase {
	@Test
	public void testMacd() {
		float[] hqCloseData601162 = new float[] {
				2.58f, 2.84f, 3.12f, 3.43f, 3.77f, 4.15f, 4.57f,
				5.03f, 5.53f, 6.08f, 6.69f, 7.36f, 7.67f, 7.36f, 6.8f, 6.63f, 6.93f,
				7.06f, 6.76f, 7.02f, 7.05f, 7.76f, 7.94f, 8.15f, 7.5f, 6.93f, 6.91f,
				6.79f, 6.9f, 6.21f
		};
		float[] expectedDiff = new float[] {
				0.000f, 0.021f, 0.059f, 0.113f, 0.181f, 0.263f, 0.358f,
				0.464f, 0.582f, 0.712f, 0.855f, 1.010f, 1.144f, 1.212f,
				1.207f, 1.175f, 1.161f, 1.147f, 1.099f, 1.070f, 1.037f,
				1.056f, 1.074f, 1.092f, 1.042f, 0.945f, 0.857f, 0.769f,
				0.699f, 0.582f};
		float[] expectedDea = new float[] {
				0.000f, 0.004f, 0.015f, 0.035f, 0.064f, 0.104f, 0.155f,
				0.217f, 0.290f, 0.374f, 0.470f, 0.578f, 0.691f, 0.796f,
				0.878f, 0.937f, 0.982f, 1.015f, 1.032f, 1.040f, 1.039f,
				1.043f, 1.049f, 1.057f, 1.054f, 1.032f, 0.997f, 0.952f,
				0.901f, 0.837f};
		
		float[] diff = new float[hqCloseData601162.length];
		float[] dea = new float[hqCloseData601162.length];
		CalMACD.macd(hqCloseData601162, 12, 26, 9, diff, dea);
		Assert.assertArrayEquals(expectedDiff, diff, 0.001f);
		Assert.assertArrayEquals(expectedDea, dea, 0.001f);
	}
}
