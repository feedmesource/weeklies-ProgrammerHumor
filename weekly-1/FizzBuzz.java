class FizzBuzz {
public static void main(String[] args){for(int l3kYz7YGeV=1;l3kYz7YGeV<=100;l3kYz7YGeV++){StringBuilder FOVXrQ1o84=new StringBuilder("");FOVXrQ1o84.append(l3kYz7YGeV%3==0?"Fizz":"");FOVXrQ1o84.append(l3kYz7YGeV%5==0?"Buzz":"");FOVXrQ1o84.append(l3kYz7YGeV%7==0?"Rizz":"");FOVXrQ1o84.append(l3kYz7YGeV%11==0?"Jazz":"");FOVXrQ1o84.append(120%l3kYz7YGeV==0?"Dizz":"");FOVXrQ1o84.append(rsuZbGuOwB(l3kYz7YGeV)?(LQf1N0Orvo(l3kYz7YGeV)?"Prizz":""):"");FOVXrQ1o84.append(FOVXrQ1o84.length()==0?l3kYz7YGeV:"");System.out.println(FOVXrQ1o84.toString());}}
static boolean rsuZbGuOwB(int jVVjPQMOCy){if(jVVjPQMOCy==1){return false;}double JfPgdwwCS5=Math.pow(jVVjPQMOCy,0.5);for(int i=2;i<=JfPgdwwCS5;i++){if(jVVjPQMOCy%i==0){return false;}}return true;}
static boolean LQf1N0Orvo(int H2TL8PQZWe){do{H2TL8PQZWe++;if(H2TL8PQZWe%7==0||H2TL8PQZWe%11==0){return true;}}while(!rsuZbGuOwB(H2TL8PQZWe));return false;}
}
