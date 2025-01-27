package multithreading;

public class Package {


   private Long pkgId;

   private Long parentPkgId;

    public Package() {

    }


    public Long getParentPkgId() {
        return parentPkgId;
    }

    public Long getPkgId() {
        return pkgId;
    }

    public void setParentPkgId(Long parentPkgId) {
        this.parentPkgId = parentPkgId;
    }

    public void setPkgId(Long pkgId) {
        this.pkgId = pkgId;
    }

    public Package(Long pkgId, Long parentPkgId) {
        this.pkgId = pkgId;
        this.parentPkgId = parentPkgId;
    }
}



