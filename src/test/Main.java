package test;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class Main extends Agent {

    String[] agents = Data.agents;
    String[] aga = Data.aga;
    String[] info = Data.info;

    @Override
    protected void setup() {
        System.out.println("Main start");
        for (int i = 0; i < agents.length; i++) {
            ACLMessage acl = new ACLMessage(ACLMessage.INFORM);
            acl.addReceiver(new AID(agents[i], false));
            acl.setContent(info[i]);
            send(acl);
            ACLMessage acl2 = new ACLMessage(ACLMessage.INFORM);
            acl2.addReceiver(new AID(aga[i], false));
            acl2.setContent(info[i]);
            send(acl2);
        }
    }

}
