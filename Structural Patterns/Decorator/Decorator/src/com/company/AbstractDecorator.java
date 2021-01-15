package com.company;

public abstract class AbstractDecorator extends Component {
    protected Component com;

    public void setComponent(Component c) {
        com = c;
    }

    @Override
    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}
