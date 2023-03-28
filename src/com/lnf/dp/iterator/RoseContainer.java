package com.lnf.dp.iterator;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/21/2023, Tuesday
 **/
public class RoseContainer implements Container<Rose> {
    private Rose[] roses = {new Rose("alex"),new Rose("lili"),new Rose("lucy"), new Rose("amy")};
    @Override
    public CIterator<Rose> getIterator() {
        return new RoseIterator();
    }
    private class RoseIterator implements CIterator<Rose>{

        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < roses.length) return true;
            else return false;
        }

        @Override
        public Rose next() {
            if(hasNext()){
                return roses[index++];
            }
            return null;
        }
    }
}
