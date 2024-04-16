package ru.gb.FamilyTree.Presenter;

import ru.gb.FamilyTree.Model.Servise.ServiseFT;
import ru.gb.FamilyTree.View.ViewFT;
import ru.gb.study_group.Model.Service.Service;

public class PresenterFT {

    private ViewFT viewFT;
    private ServiseFT serviseFT;

    public PresenterFT(ViewFT viewFT) {
        this.viewFT = viewFT;
        serviseFT = new ServiseFT();
    }

}
