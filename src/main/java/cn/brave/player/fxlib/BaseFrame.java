package cn.brave.player.fxlib;

import com.sun.glass.ui.EventLoop;
import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.EventListener;

/**
 * @author Brave
 * @create 2021-08-25 14:08
 * @description
 **/
public abstract class BaseFrame extends Stage {

    FrameDecorator decorator;

    protected final void init() {
        decorator = new FrameDecorator(this);
        initStyle(StageStyle.UNDECORATED);
    }

    /**
     * subclasses private
     */
    private static class FrameDecorator implements EventHandler<MouseEvent> {

        double x, y;    //当前x，y坐标
        double _x, _y;  //之前的x,y坐标

        private BaseFrame frame;

        public FrameDecorator(BaseFrame frame) {
            this.frame = frame;
        }

        @Override
        public void handle(MouseEvent event) {
            if (event.getButton().equals(MouseButton.PRIMARY)) {
                System.out.println(event.getX() + "," + event.getY());
            }
        }
    }


}
