package id.sch.smktelkom_mlg.project.xiirpl204142434.plum.model;

/**
 * Created by Amalia on 19/11/2016.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;

    public NavDrawerItem() {
    }

    public NavDrawerItem(boolean showNotify, String title) {
        this.showNotify = showNotify;
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
