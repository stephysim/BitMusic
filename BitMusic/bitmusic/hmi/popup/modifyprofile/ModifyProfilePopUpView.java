/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.hmi.popup.modifyprofile;

import bitmusic.hmi.patterns.AbstractView;
import bitmusic.hmi.patterns.Observable;

/**
 *
 * @author unkedeuxke
 */
public final class ModifyProfilePopUpView extends AbstractView<ModifyProfilePopUpController> {

    private final String type = "POPUP";

    public ModifyProfilePopUpView() {
        super();
    }

    @Override
    public void initPanel() {
        System.out.println("--- ModifyProfilePopUpView.initPanel()");

        // TODO
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void update(Observable obj, String str) {
        System.out.println("----- ModifyProfilePopUpView.update()");
    }
}
