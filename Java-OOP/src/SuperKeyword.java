class SuperKeyword {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends SuperKeyword{
    int getCorner(){
        return 4;
    }

    // Super keyword untuk mengakses parent yg telah di overriding
    int getParentCorner(){
        return super.getCorner();
    }
}