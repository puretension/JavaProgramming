import java.util.*;


//public class boj1302 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		in.nextLine();
//		HashMap<String, Integer>mp = new HashMap<>();
//		
//		String [] strArray = new String [N];
//		
//		int cnt = 0;
//		String maxStr = "";
//		for(int i = 0;i<N;i++) {
//			strArray[i] = in.nextLine();
//			if(mp.containsKey(strArray[i]))  {
//				mp.put(strArray[i], mp.get(strArray[i]) + 1);	
//				if(cnt < mp.get(strArray[i])) {
//					cnt = mp.get(strArray[i]);
//					maxStr = strArray[i];
//				}
//				else if(cnt == mp.get(strArray[i])) { 
//					for(int j = 0;j<strArray[i].length();j++) { 
//						if(maxStr.charAt(j) > strArray[i].charAt(j)) { 
//							maxStr = strArray[i];
//							break;
//						}
//					}
//				}
//			}
//			else { 
//				mp.put(strArray[i], 1);
//				if(cnt < mp.get(strArray[i])) {
//					cnt = mp.get(strArray[i]);
//					maxStr = strArray[i];
//				}
//			}
//		}
//		
//		System.out.println(maxStr);
//		
//	}
//
//}




//import java.util.*;
//
//public class boj1302 {
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        in.nextLine();
//        HashMap<String, Integer> mp = new HashMap<>();
//
//        String[] strArray = new String[N];
//
//        int cnt = 0;
//        String maxStr = "";
//        for (int i = 0; i < N; i++) {
//            strArray[i] = in.nextLine();
//            if (mp.containsKey(strArray[i])) {
//                mp.put(strArray[i], mp.getOrDefault(strArray[i], 0) + 1);
//                if (cnt < mp.get(strArray[i])) {
//                    cnt = mp.get(strArray[i]);
//                    maxStr = strArray[i];
//                } else if (cnt == mp.get(strArray[i])) {
//                	int maxLength;
//                	maxLength = (strArray[i].length() >= maxStr.length()) ?strArray[i].length(): maxStr.length();
//                    for (int j = 0; j < maxLength; j++) {
//                    	//동일 cnt 문자열이 더 오름차순이라면?
//                        if (maxStr.charAt(j) > strArray[i].charAt(j)) {
//                            maxStr = strArray[i];
//                            break;
//                        }
//                        //기존 cnt 문자열이 더 오름차순이라면?
//                        else if (maxStr.charAt(j) < strArray[i].charAt(j)) {
//                            break;
//                        }
//                    }
//                }
//            } else {
//                mp.put(strArray[i], 1);
//                if (cnt < mp.get(strArray[i])) {
//                    cnt = mp.get(strArray[i]);
//                    maxStr = strArray[i];
//                }
//                else if (cnt == mp.get(strArray[i])) {
//                	int maxLength;
//                	maxLength = (strArray[i].length() >= maxStr.length()) ?strArray[i].length(): maxStr.length();
//                    for (int j = 0; j < maxLength; j++) {
//                    	//동일 cnt 문자열이 더 오름차순이라면?
//                        if (maxStr.charAt(j) > strArray[i].charAt(j)) {
//                            maxStr = strArray[i];
//                            break;
//                        }
//                        //기존 cnt 문자열이 더 오름차순이라면?
//                        else if (maxStr.charAt(j) < strArray[i].charAt(j)) {
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(maxStr);
//
//    }
//
//}

