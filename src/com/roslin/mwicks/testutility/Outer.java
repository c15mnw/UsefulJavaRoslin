package com.roslin.mwicks.testutility;

class Outer {
	
	private int a = 12;
    private int b = 6;
    
    Outer() {
    	
        NestedA nestedA = new NestedA(4);
        a = a - 12;
    }
    
    class NestedA {
    	
        NestedA(int y){
        	
            NestedB nestedB = new NestedB(y);
            nestedB.methodB(y, a);
            a = a + b - y;
        }
    
        private void methodA(int z) {
        	
            System.out.print( "-a" + a + z + "-b" + ( b - z ) );
        }
        
        class NestedB {
        	
            NestedB(int i) {
            
            	a = a - i; 
            	b = b + i;
            }
        
            private void methodB(int x, int z) {
            	
                if(x < 5) {
                
                	a = a + x + b;
                }
                
                b = b + z;
                
                System.out.print( "-a" + a + "-b" + b );
            }
        }
    }
    
    public static void main(String[] args) {
    	
        NestedA nestedA = new Outer().new NestedA(2);
    }
}