package players;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.*;

public class Agent1 extends Agent {

    @Override
    public void setup() {
        System.out.println("Agent1 started");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage message = receive();
                if (message != null) {
                    JOptionPane.showMessageDialog(new JFrame(), "message 1 " + message.getContent());
                }
            }
        });

    }

    @Override
    protected void takeDown() {
        System.out.println("agent1 killed");
    }

}
