class Marathon1 {
    public static void main(String[] arguments) {

        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 117, 65
        };

        int minTime = times[0];
        String minName = names[0];
        int minTime2 = times[0];
        String minName2 = names[0];
        for (int i = 0; i < names.length; i++) {
            if (times[i] < minTime) {
                minTime = times[i];
                minName = names[i];
            }   
        }

        for (int i = 0; i < names.length; i++) {
            if(times[i] == minTime) 
                continue;
            if (times[i] < minTime2) {
                minTime2 = times[i];
                minName2 = names[i];
            }   
        }


        System.out.println(minName + ": " + minTime);
        System.out.println(minName2 + ": " + minTime2);
    }
}

// 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,


//  minTime2=341 ; minTime=273;
//  minTime2=278 ;
