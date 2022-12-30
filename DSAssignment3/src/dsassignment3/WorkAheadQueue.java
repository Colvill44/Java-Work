/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment3;
import DataStructures.LinearNode;
import java.util.ArrayList;
/**
 *
 * @author colvi
 */
public class WorkAheadQueue implements WorkAheadQueueADT {
    protected LinearNode<T> front;
    protected LinearNode<T> back;
    protected ArrayList<LinearNode<T>> frontThreeNodes;
    protected ArrayList<T> frontThreeElements;
    protected int numNodes;


    public WorkAheadQueue(){
        numNodes = 0;
        frontThreeNodes = new ArrayList<>();
        frontThreeElements = new ArrayList<>();

    }
    @Override
    public T dequeue(int x) throws EmptyCollectionException, InvalidArgumentException {
        LinearNode<T> node =front;
        if(x >4 || x > numNodes){
            throw new InvalidArgumentException("invalid parameter");
        }

        else if (isEmpty()){
            throw new EmptyCollectionException("Queue is empty");
        }

        else if ( x> 4 || x>= numNodes) {
            throw new InvalidArgumentException("Invalid parameter");
        }

        else if (x==0){
            if (numNodes !=1) {
                front.getNext().setPrev(null);
            }
            front= front.getNext();
        }
        else {
            for (int i =0; i< x; i++){
                node = node.getNext();
            }
            try{
                node.getNext().setPrev(node.getPrev());
                node.getPrev().setNext(node.getNext());
            }catch (NullPointerException e) {
            }

        }

        numNodes--;
        return node.getElement();
    }


    @Override
    public T first(int x) throws EmptyCollectionException, InvalidArgumentException {
        LinearNode<T> node =front;

        if(x >4 || x < 0 || x > numNodes){
            throw new InvalidArgumentException("invalid parameter");
        }

        else if (isEmpty()){
            throw new EmptyCollectionException("Queue is empty");
        }
        else {
            for (int i =0; i< x; i++){
                node = node.getNext();
            }
        }
        return node.getElement();
    }

    @Override
    public ArrayList<LinearNode<T>> firstThreeNodes() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("firstThreeNodes(): empty "
                        + "queue");
        }

        frontThreeNodes.clear();
        LinearNode<T> curr = front;

        for (int i = 0; i < 3 && i < size(); i++) {
            frontThreeNodes.add(i, curr);
            curr = curr.getNext();
        }
        return frontThreeNodes;
    }

    @Override
    public ArrayList<T> firstThreeElements() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("firstThreeElements(): empty "
                        + "queue");
        }

        frontThreeElements.clear();
        LinearNode<T> curr = front;

        for (int i = 0; i < 3 && i < size(); i++) {
            frontThreeElements.add(i, curr.getElement());
            curr = curr.getNext();
        }

        return frontThreeElements;

    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> myNode = new LinearNode<T>(element);
        if(isEmpty()){
            front = myNode;
            back = myNode;
            numNodes++;
            ThreeUpdated();
        }
        else{
            back.setNext(myNode);
            myNode.setPrev(back);
            back = myNode;
            numNodes++;
            frontThreeNodes.clear();
            frontThreeElements.clear();
        }
        ThreeUpdated();

    }

    @Override
    public T dequeue() throws EmptyCollectionException {

        if (isEmpty()){
            throw new EmptyCollectionException("empty Queue");
        }

        T ret= front.getElement();
        if( numNodes != 1){
            front.getNext().setPrev(null);

        }

        front = front.getNext();
        numNodes--;

        ThreeUpdated();
        return ret;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException("empty Queue");
        }
        else{
            T ret = front.getElement();
            return ret;
        }
    }
    @Override
    public boolean isEmpty() {
        return numNodes == 0;
    }

    @Override
    public int size() {
        return numNodes;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        LinearNode curr = front;
        for (int i = 0; i < size(); i++) {
            sb.append(curr.getElement().toString());
            if (i < size() - 1) {
                sb.append(", ");
            }
            curr = curr.getNext();
        }
        return sb.toString();
    }

    public void ThreeUpdated()
    {
        frontThreeNodes.clear();
        frontThreeElements.clear();
        try{
            frontThreeNodes.add(front);
            frontThreeElements.add(front.getElement());
            frontThreeNodes.add(front.getNext());
            frontThreeElements.add(front.getNext().getElement());
            frontThreeElements.add(front.getNext().getNext().getElement());
            frontThreeNodes.add(front.getNext().getNext());
        }

        catch(Exception E){
        }   
    }
}

