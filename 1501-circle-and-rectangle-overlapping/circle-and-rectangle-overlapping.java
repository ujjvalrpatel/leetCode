class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int cup=yCenter +radius ;
        int cdown=yCenter-radius;
        int cright=xCenter+radius;
        int cleft=xCenter-radius;
        if(((cright<x1)||(cleft>x2)||(cup<y1)||(cdown>y2))){
            return false;
        }
        int xDist = 0;
        int yDist = 0;
        if (xCenter < x1) xDist = x1 - xCenter;
        else if (xCenter > x2) xDist = xCenter - x2;
        
        if (yCenter < y1) yDist = y1 - yCenter;
        else if (yCenter > y2) yDist = yCenter - y2;
        
        // 3. Verify using Pythagorean theorem for the corners
        return (xDist * xDist + yDist * yDist) <= (radius * radius);
    }
}