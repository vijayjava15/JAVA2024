package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Package pkge = new Package(111l,null);
        List<Package> pkgList = new ArrayList<>();
        Package pkge1 = new Package(11111l,111l);
        pkgList.add(pkge);
        pkgList.add(pkge1);
        Package pkge11 = new Package(112l,null);
        Package pkge1112 = new Package(222222l,112l);
        pkgList.add(pkge11);
        pkgList.add(pkge1112);
        Map<Long, List<Package>>   map= pkgList.stream().collect(Collectors.groupingBy(Package::getPkgId));
    }



}
