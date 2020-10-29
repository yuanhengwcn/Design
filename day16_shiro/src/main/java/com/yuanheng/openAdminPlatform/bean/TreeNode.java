package com.yuanheng.openAdminPlatform.bean;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.bean
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 17:50
 */
public class TreeNode {

    private Integer id;
    private Integer pId;
    private String name;
    private boolean checked;
    private boolean open;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
