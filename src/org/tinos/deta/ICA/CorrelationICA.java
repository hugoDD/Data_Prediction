package org.tinos.deta.ICA;
public class CorrelationICA{
	//比较简单的鸡尾酒频率盲分割
	public static double[] frequencyUpSplit(double[] originFrequency, double[] compareFrequency) {
		double[] output= new double[originFrequency.length];
		for(int i= 0; i< originFrequency.length; i++) {
			output[i]= originFrequency[i]- compareFrequency[i]> 0? originFrequency[i]: 0;
		}
		return output;	
	}
	
	public static double[] frequencyDownSplit(double[] originFrequency, double[] compareFrequency) {
		double[] output= new double[originFrequency.length];
		for(int i= 0; i< originFrequency.length; i++) {
			output[i]= originFrequency[i]- compareFrequency[i]< 0? originFrequency[i]: 0;
		}
		return output;	
	}
	
	
}