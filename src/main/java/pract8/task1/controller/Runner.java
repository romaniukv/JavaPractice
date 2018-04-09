package pract8.task1.controller;

import pract8.task1.model.StringReplacer;
import pract8.task1.utils.InputUtils;
import pract8.task1.view.Viewer;

public class Runner {

    private Viewer viewer;
    private StringReplacer stringReplacer;

    public Runner(Viewer viewer, StringReplacer stringReplacer) {
        this.viewer = viewer;
        this.stringReplacer = stringReplacer;
    }

    public void run() {
        int key = 0;
        while (key != 5) {
            viewer.showString(Viewer.MENU);
            key = InputUtils.inputInt();
            switch (key) {
                case 1:
                    stringReplacer.setString("Default string.");
                    break;
                case 2:
                    viewer.showString(Viewer.INPUT_STRING);
                    stringReplacer.setString(InputUtils.inputString());
                    break;
                case 3:
                    viewer.showString(Viewer.INPUT_REPLACEMENT_STRING);
                    if (stringReplacer.replaceString(InputUtils.inputString()))
                        viewer.showString(Viewer.STRING_IS_CHANGED);
                    else
                        viewer.showString(Viewer.STRING_NOT_CHANGED);
                    break;
                case 4:
                    viewer.showString(Viewer.CURRENT_STRING);
                    viewer.showString(stringReplacer.getString());
                    break;
                case 5:
                    viewer.showString(Viewer.INPUT_ERROR);
                    break;
                default:
                    break;
            }
        }


    }
}
