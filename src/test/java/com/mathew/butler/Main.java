package com.mathew.butler;

import java.util.*;

public class Main {
    // 初始化数据，使用map因为它的，key和Value的结构是对应的
    public static Map<String, String> getNums() {
        Map<String, String> nums = null;
        nums = new LinkedHashMap<>();
        
        nums.put("Ling", "Zero");
        
        nums.put("Yi", "One");
        
        nums.put("Er", "Two");
        
        nums.put("San", "Three");
        
        nums.put("Si", "Four");
        
        nums.put("Wu", "Five");
        
        nums.put("Liu", "Six");
        
        nums.put("Qi", "Seven");
        
        nums.put("Ba", "Eight");
        
        nums.put("Jiu", "Nine");
        
        nums.put("Double", "Double");
        
        return nums;
        
    }
    
    
    /**
     * 分别得到首字母是大写的下标,一个大写就是一个单词
     * @param numChars
     * @return
     */
    public static List<Integer> getIndexs(char[] numChars) {
        
        List<Integer> indexs = new ArrayList<>();
        
        for (int i = 0; i < numChars.length; i++) {
            
            char c = numChars[i];
            
            if (!Character.isUpperCase(c)) {
                
                continue;
                
            }
            
            indexs.add(i);
            
        }
        
        indexs.add(numChars.length);
        
        return indexs;
        
    }
    
    
    
    public static void main(String[] args) {
        // 输入数字
        System.out.println("input num:");
    
        Scanner scanner = new Scanner(System.in);
        String numString = scanner.nextLine();

        // 加载初始化数据
        Map<String, String> nums = getNums();
        
        // 输出的结果
        String result = "";
        
        // 如果什么也没有输入，输出错误
        if (numString == null) {
            
            System.out.println("ERROR");
            
            return;
            
        }
        // 将String转化为char数组，为了能够一个一个字符来遍历，这样就能够划分出哪一些字符组成一个单词
        char[] numChars = numString.toCharArray();
        
        List<Integer> indexs = getIndexs(numChars);
        
        for (int i = 0; i < indexs.size() - 1; i++) {
            // 提示： SanSan的情况: 需要设置一个标量，没读一次就要对照一下，看看是否和这个标量相等，如果相等就变为double
            int before = indexs.get(i);
            
            int after = indexs.get(i + 1);
            
            // 取出单词
            
            String num = numString.substring(before, after);
            
            
            // 1. 判断是否是double
            if ("Double".equals(num)) {
                
                if (result.length() == 0) {
                    
                    System.out.println("ERROR");
                    
                }
                // 出现了Double，从之前放入结果中的数字再拿出来再输出一次
                List<Integer> list = getIndexs(result.toCharArray());
                
                int beforeA = list.get(list.size() - 2);
                
                int beforeB = list.get(list.size() - 1);
                
                result += result.substring(beforeA, beforeB);
                
                continue;
                
            }
    
    
            // 2. 判断key是否含有这个字母，此时肯定不是double了
            
            if (nums.containsKey(num)) {
                
                result += nums.get(num);
                
                continue;
                
            }
            // 3. 判断value中是否含有这个字母
            if (nums.containsValue(num)) {
                
                Set<String> numsSet = nums.keySet();
                
                for (String set : numsSet) {
                    
                    if (!num.equals(nums.get(set))) {
                        
                        continue;
                        
                    }
                    
                    result += set;
                    
                }
                
                continue;
                
            }
            
        }
        
        System.out.println(result);
        
    }
}
