package me.ykrank.s1next.widget;

import android.content.Context;
import android.util.SparseArray;

import com.google.common.collect.ImmutableList;

import java.util.List;

import me.ykrank.s1next.R;
import me.ykrank.s1next.data.api.model.Emoticon;

/**
 * A factory provides emotions.
 */
public final class EmoticonFactory {

    public static final String ASSET_PATH_EMOTICON = "file:///android_asset/image/emoticon/";

    private final List<String> mEmoticonTypeTitles;
    private final SparseArray<List<Emoticon>> mEmoticons;

    public EmoticonFactory(Context context) {
        mEmoticonTypeTitles = ImmutableList.copyOf(context.getResources().getStringArray(
                R.array.emoticon_type));
        mEmoticons = new SparseArray<>();
    }

    public List<String> getEmotionTypeTitles() {
        return mEmoticonTypeTitles;
    }

    public List<Emoticon> getEmoticonsByIndex(int index) {
        List<Emoticon> emoticons = mEmoticons.get(index);
        if (emoticons == null) {
            switch (index) {
                case 0:
                    emoticons = getFaceEmoticonList();
                    break;
                case 1:
                    emoticons = getCartonEmoticonList();
                    break;
                case 2:
                    emoticons = getAnimalEmoticonList();
                    break;
                case 3:
                    emoticons = getDeviceEmoticonList();
                    break;
                case 4:
                    emoticons = getGooseEmoticonList();
                    break;
                case 5:
                    emoticons = getBundamEmoticonList();
                    break;
                default:
                    throw new IllegalStateException("Unknown emoticon index: " + index + ".");
            }
        }
        mEmoticons.put(index, emoticons);

        return emoticons;
    }

    private List<Emoticon> getFaceEmoticonList() {
        ImmutableList.Builder<Emoticon> builder = ImmutableList.builder();
        add(builder, "face2017/001.png", "[f:001]");
        add(builder, "face2017/002.png", "[f:002]");
        add(builder, "face2017/003.png", "[f:003]");
        add(builder, "face2017/004.gif", "[f:004]");
        add(builder, "face2017/005.png", "[f:005]");
        add(builder, "face2017/006.png", "[f:006]");
        add(builder, "face2017/007.png", "[f:007]");
        add(builder, "face2017/008.png", "[f:008]");
        add(builder, "face2017/009.gif", "[f:009]");
        add(builder, "face2017/010.png", "[f:010]");
        add(builder, "face2017/011.png", "[f:011]");
        add(builder, "face2017/012.png", "[f:012]");
        add(builder, "face2017/013.png", "[f:013]");
        add(builder, "face2017/014.png", "[f:014]");
        add(builder, "face2017/015.png", "[f:015]");
        add(builder, "face2017/016.png", "[f:016]");
        add(builder, "face2017/017.png", "[f:017]");
        add(builder, "face2017/018.png", "[f:018]");
        add(builder, "face2017/019.png", "[f:019]");
        add(builder, "face2017/020.png", "[f:020]");
        add(builder, "face2017/021.png", "[f:021]");
        add(builder, "face2017/022.png", "[f:022]");
        add(builder, "face2017/023.png", "[f:023]");
        add(builder, "face2017/024.png", "[f:024]");
        add(builder, "face2017/025.png", "[f:025]");
        add(builder, "face2017/026.png", "[f:026]");
        add(builder, "face2017/027.png", "[f:027]");
        add(builder, "face2017/028.png", "[f:028]");
        add(builder, "face2017/029.png", "[f:029]");
        add(builder, "face2017/030.png", "[f:030]");
        add(builder, "face2017/031.png", "[f:031]");
        add(builder, "face2017/032.png", "[f:032]");
        add(builder, "face2017/033.png", "[f:033]");
        add(builder, "face2017/034.png", "[f:034]");
        add(builder, "face2017/035.png", "[f:035]");
        add(builder, "face2017/036.png", "[f:036]");
        add(builder, "face2017/037.png", "[f:037]");
        add(builder, "face2017/038.png", "[f:038]");
        add(builder, "face2017/039.png", "[f:039]");
        add(builder, "face2017/040.png", "[f:040]");
        add(builder, "face2017/041.png", "[f:041]");
        add(builder, "face2017/042.png", "[f:042]");
        add(builder, "face2017/043.png", "[f:043]");
        add(builder, "face2017/044.png", "[f:044]");
        add(builder, "face2017/045.png", "[f:045]");
        add(builder, "face2017/046.png", "[f:046]");
        add(builder, "face2017/047.png", "[f:047]");
        add(builder, "face2017/048.png", "[f:048]");
        add(builder, "face2017/049.png", "[f:049]");
        add(builder, "face2017/050.png", "[f:050]");
        add(builder, "face2017/051.png", "[f:051]");
        add(builder, "face2017/052.png", "[f:052]");
        add(builder, "face2017/053.png", "[f:053]");
        add(builder, "face2017/054.png", "[f:054]");
        add(builder, "face2017/055.png", "[f:055]");
        add(builder, "face2017/056.gif", "[f:056]");
        add(builder, "face2017/057.png", "[f:057]");
        add(builder, "face2017/058.png", "[f:058]");
        add(builder, "face2017/059.png", "[f:059]");
        add(builder, "face2017/060.png", "[f:060]");
        add(builder, "face2017/061.gif", "[f:061]");
        add(builder, "face2017/062.gif", "[f:062]");
        add(builder, "face2017/063.png", "[f:063]");
        add(builder, "face2017/064.png", "[f:064]");
        add(builder, "face2017/065.png", "[f:065]");
        add(builder, "face2017/066.png", "[f:066]");
        add(builder, "face2017/067.png", "[f:067]");
        add(builder, "face2017/068.png", "[f:068]");
        add(builder, "face2017/069.png", "[f:069]");
        add(builder, "face2017/070.png", "[f:070]");
        add(builder, "face2017/071.png", "[f:071]");
        add(builder, "face2017/072.png", "[f:072]");
        add(builder, "face2017/073.png", "[f:073]");
        add(builder, "face2017/074.png", "[f:074]");
        add(builder, "face2017/075.png", "[f:075]");
        add(builder, "face2017/076.png", "[f:076]");
        add(builder, "face2017/077.png", "[f:077]");
        add(builder, "face2017/078.png", "[f:078]");
        add(builder, "face2017/079.png", "[f:079]");
        add(builder, "face2017/080.png", "[f:080]");
        add(builder, "face2017/081.png", "[f:081]");
        add(builder, "face2017/082.png", "[f:082]");
        add(builder, "face2017/083.png", "[f:083]");
        add(builder, "face2017/084.png", "[f:084]");
        add(builder, "face2017/085.png", "[f:085]");
        add(builder, "face2017/086.png", "[f:086]");
        add(builder, "face2017/087.gif", "[f:087]");
        add(builder, "face2017/088.png", "[f:088]");
        add(builder, "face2017/089.png", "[f:089]");
        add(builder, "face2017/090.png", "[f:090]");
        add(builder, "face2017/091.png", "[f:091]");
        add(builder, "face2017/092.png", "[f:092]");
        add(builder, "face2017/093.png", "[f:093]");
        add(builder, "face2017/094.png", "[f:094]");
        add(builder, "face2017/095.png", "[f:095]");
        add(builder, "face2017/096.png", "[f:096]");
        add(builder, "face2017/097.png", "[f:097]");
        add(builder, "face2017/098.png", "[f:098]");
        add(builder, "face2017/099.png", "[f:099]");
        add(builder, "face2017/100.png", "[f:100]");
        add(builder, "face2017/101.png", "[f:101]");
        add(builder, "face2017/102.png", "[f:102]");
        add(builder, "face2017/103.png", "[f:103]");
        add(builder, "face2017/104.png", "[f:104]");
        add(builder, "face2017/105.png", "[f:105]");
        add(builder, "face2017/106.png", "[f:106]");
        add(builder, "face2017/107.png", "[f:107]");
        add(builder, "face2017/108.png", "[f:108]");
        add(builder, "face2017/109.png", "[f:109]");
        add(builder, "face2017/110.png", "[f:110]");
        add(builder, "face2017/111.png", "[f:111]");
        add(builder, "face2017/112.png", "[f:112]");
        add(builder, "face2017/113.png", "[f:113]");
        add(builder, "face2017/114.png", "[f:114]");
        add(builder, "face2017/115.gif", "[f:115]");
        add(builder, "face2017/116.png", "[f:116]");
        add(builder, "face2017/117.png", "[f:117]");
        add(builder, "face2017/118.png", "[f:118]");
        add(builder, "face2017/119.png", "[f:119]");
        add(builder, "face2017/120.gif", "[f:120]");
        add(builder, "face2017/121.png", "[f:121]");
        add(builder, "face2017/122.png", "[f:122]");
        add(builder, "face2017/123.png", "[f:123]");
        add(builder, "face2017/124.png", "[f:124]");
        add(builder, "face2017/125.png", "[f:125]");
        add(builder, "face2017/126.png", "[f:126]");
        add(builder, "face2017/127.png", "[f:127]");
        add(builder, "face2017/128.png", "[f:128]");
        add(builder, "face2017/129.png", "[f:129]");
        add(builder, "face2017/130.png", "[f:130]");
        add(builder, "face2017/131.png", "[f:131]");
        add(builder, "face2017/132.png", "[f:132]");
        add(builder, "face2017/133.png", "[f:133]");
        add(builder, "face2017/134.png", "[f:134]");
        add(builder, "face2017/135.png", "[f:135]");
        add(builder, "face2017/136.png", "[f:136]");
        add(builder, "face2017/137.gif", "[f:137]");
        add(builder, "face2017/138.png", "[f:138]");
        add(builder, "face2017/139.png", "[f:139]");
        add(builder, "face2017/140.png", "[f:140]");
        add(builder, "face2017/141.png", "[f:141]");
        add(builder, "face2017/142.png", "[f:142]");
        add(builder, "face2017/143.png", "[f:143]");
        add(builder, "face2017/144.png", "[f:144]");
        add(builder, "face2017/145.png", "[f:145]");
        add(builder, "face2017/146.png", "[f:146]");
        add(builder, "face2017/147.png", "[f:147]");
        add(builder, "face2017/148.png", "[f:148]");
        add(builder, "face2017/149.png", "[f:149]");
        add(builder, "face2017/150.png", "[f:150]");
        add(builder, "face2017/151.png", "[f:151]");
        add(builder, "face2017/152.png", "[f:152]");
        add(builder, "face2017/153.png", "[f:153]");
        add(builder, "face2017/154.png", "[f:154]");
        add(builder, "face2017/155.png", "[f:155]");
        add(builder, "face2017/156.png", "[f:156]");
        add(builder, "face2017/157.png", "[f:157]");
        add(builder, "face2017/158.png", "[f:158]");
        add(builder, "face2017/159.png", "[f:159]");
        add(builder, "face2017/160.png", "[f:160]");
        add(builder, "face2017/161.png", "[f:161]");
        add(builder, "face2017/162.png", "[f:162]");
        add(builder, "face2017/163.png", "[f:163]");
        add(builder, "face2017/164.png", "[f:164]");
        add(builder, "face2017/165.png", "[f:165]");
        add(builder, "face2017/166.png", "[f:166]");
        add(builder, "face2017/167.png", "[f:167]");
        add(builder, "face2017/168.gif", "[f:168]");
        add(builder, "face2017/169.gif", "[f:169]");
        add(builder, "face2017/170.png", "[f:170]");
        add(builder, "face2017/171.png", "[f:171]");
        add(builder, "face2017/172.png", "[f:172]");
        add(builder, "face2017/173.png", "[f:173]");
        add(builder, "face2017/174.png", "[f:174]");
        add(builder, "face2017/175.gif", "[f:175]");
        add(builder, "face2017/176.png", "[f:176]");
        add(builder, "face2017/177.png", "[f:177]");
        add(builder, "face2017/178.png", "[f:178]");
        add(builder, "face2017/179.png", "[f:179]");
        add(builder, "face2017/180.png", "[f:180]");
        add(builder, "face2017/181.png", "[f:181]");
        add(builder, "face2017/182.png", "[f:182]");
        add(builder, "face2017/183.png", "[f:183]");
        add(builder, "face2017/184.png", "[f:184]");
        add(builder, "face2017/185.png", "[f:185]");
        add(builder, "face2017/186.png", "[f:186]");
        add(builder, "face2017/187.png", "[f:187]");
        add(builder, "face2017/188.png", "[f:188]");
        add(builder, "face2017/189.png", "[f:189]");
        add(builder, "face2017/190.png", "[f:190]");
        add(builder, "face2017/191.png", "[f:191]");
        add(builder, "face2017/192.png", "[f:192]");
        add(builder, "face2017/193.png", "[f:193]");
        add(builder, "face2017/194.png", "[f:194]");
        add(builder, "face2017/195.png", "[f:195]");
        add(builder, "face2017/196.png", "[f:196]");
        add(builder, "face2017/197.png", "[f:197]");
        add(builder, "face2017/198.png", "[f:198]");
        add(builder, "face2017/199.png", "[f:199]");
        add(builder, "face2017/200.png", "[f:200]");
        add(builder, "face2017/201.png", "[f:201]");
        add(builder, "face2017/202.png", "[f:202]");
        add(builder, "face2017/203.png", "[f:203]");
        add(builder, "face2017/204.png", "[f:204]");
        add(builder, "face2017/205.png", "[f:205]");
        add(builder, "face2017/206.gif", "[f:206]");
        add(builder, "face2017/207.png", "[f:207]");
        add(builder, "face2017/208.png", "[f:208]");
        return builder.build();
    }

    private List<Emoticon> getCartonEmoticonList() {
        ImmutableList.Builder<Emoticon> builder = ImmutableList.builder();
        add(builder, "carton2017/001.png", "[c:001]");
        add(builder, "carton2017/002.png", "[c:002]");
        add(builder, "carton2017/003.png", "[c:003]");
        add(builder, "carton2017/004.png", "[c:004]");
        add(builder, "carton2017/005.png", "[c:005]");
        add(builder, "carton2017/006.png", "[c:006]");
        add(builder, "carton2017/007.png", "[c:007]");
        add(builder, "carton2017/008.png", "[c:008]");
        add(builder, "carton2017/009.png", "[c:009]");
        add(builder, "carton2017/010.png", "[c:010]");
        add(builder, "carton2017/011.png", "[c:011]");
        add(builder, "carton2017/012.png", "[c:012]");
        add(builder, "carton2017/013.png", "[c:013]");
        add(builder, "carton2017/014.png", "[c:014]");
        add(builder, "carton2017/015.png", "[c:015]");
        add(builder, "carton2017/016.gif", "[c:016]");
        add(builder, "carton2017/017.png", "[c:017]");
        add(builder, "carton2017/018.gif", "[c:018]");
        add(builder, "carton2017/019.png", "[c:019]");
        add(builder, "carton2017/020.png", "[c:020]");
        add(builder, "carton2017/021.png", "[c:021]");
        add(builder, "carton2017/022.png", "[c:022]");
        add(builder, "carton2017/023.png", "[c:023]");
        add(builder, "carton2017/024.png", "[c:024]");
        add(builder, "carton2017/025.png", "[c:025]");
        add(builder, "carton2017/026.png", "[c:026]");
        add(builder, "carton2017/027.png", "[c:027]");
        add(builder, "carton2017/028.png", "[c:028]");
        add(builder, "carton2017/029.png", "[c:029]");
        add(builder, "carton2017/030.png", "[c:030]");
        add(builder, "carton2017/031.png", "[c:031]");
        add(builder, "carton2017/032.png", "[c:032]");
        add(builder, "carton2017/033.png", "[c:033]");
        add(builder, "carton2017/034.png", "[c:034]");
        add(builder, "carton2017/035.png", "[c:035]");
        add(builder, "carton2017/036.png", "[c:036]");
        add(builder, "carton2017/037.png", "[c:037]");
        add(builder, "carton2017/038.png", "[c:038]");
        add(builder, "carton2017/039.png", "[c:039]");
        add(builder, "carton2017/040.png", "[c:040]");
        add(builder, "carton2017/041.png", "[c:041]");
        add(builder, "carton2017/042.png", "[c:042]");
        add(builder, "carton2017/043.png", "[c:043]");
        add(builder, "carton2017/044.png", "[c:044]");
        add(builder, "carton2017/045.png", "[c:045]");
        add(builder, "carton2017/046.png", "[c:046]");
        add(builder, "carton2017/047.png", "[c:047]");
        add(builder, "carton2017/048.png", "[c:048]");
        add(builder, "carton2017/049.gif", "[c:049]");
        add(builder, "carton2017/050.png", "[c:050]");
        add(builder, "carton2017/051.png", "[c:051]");
        add(builder, "carton2017/052.png", "[c:052]");
        add(builder, "carton2017/053.png", "[c:053]");
        add(builder, "carton2017/054.png", "[c:054]");
        add(builder, "carton2017/055.png", "[c:055]");
        add(builder, "carton2017/056.png", "[c:056]");
        add(builder, "carton2017/057.png", "[c:057]");
        add(builder, "carton2017/058.png", "[c:058]");
        add(builder, "carton2017/059.png", "[c:059]");
        add(builder, "carton2017/060.png", "[c:060]");
        add(builder, "carton2017/061.png", "[c:061]");
        add(builder, "carton2017/062.png", "[c:062]");
        add(builder, "carton2017/063.png", "[c:063]");
        add(builder, "carton2017/064.png", "[c:064]");
        add(builder, "carton2017/065.png", "[c:065]");
        add(builder, "carton2017/066.png", "[c:066]");
        add(builder, "carton2017/067.png", "[c:067]");
        add(builder, "carton2017/068.png", "[c:068]");
        add(builder, "carton2017/069.png", "[c:069]");
        add(builder, "carton2017/070.png", "[c:070]");
        add(builder, "carton2017/071.png", "[c:071]");
        add(builder, "carton2017/072.png", "[c:072]");
        add(builder, "carton2017/073.png", "[c:073]");
        add(builder, "carton2017/074.png", "[c:074]");
        add(builder, "carton2017/075.png", "[c:075]");
        add(builder, "carton2017/076.png", "[c:076]");
        add(builder, "carton2017/077.gif", "[c:077]");
        add(builder, "carton2017/078.png", "[c:078]");
        add(builder, "carton2017/079.png", "[c:079]");
        add(builder, "carton2017/080.png", "[c:080]");
        add(builder, "carton2017/081.png", "[c:081]");
        add(builder, "carton2017/082.png", "[c:082]");
        add(builder, "carton2017/083.png", "[c:083]");
        add(builder, "carton2017/084.png", "[c:084]");
        add(builder, "carton2017/085.png", "[c:085]");
        add(builder, "carton2017/086.png", "[c:086]");
        add(builder, "carton2017/087.png", "[c:087]");
        add(builder, "carton2017/088.png", "[c:088]");
        add(builder, "carton2017/089.gif", "[c:089]");
        add(builder, "carton2017/090.gif", "[c:090]");
        add(builder, "carton2017/091.gif", "[c:091]");
        add(builder, "carton2017/092.gif", "[c:092]");
        add(builder, "carton2017/093.gif", "[c:093]");
        add(builder, "carton2017/094.gif", "[c:094]");
        add(builder, "carton2017/095.gif", "[c:095]");
        add(builder, "carton2017/096.gif", "[c:096]");
        add(builder, "carton2017/097.gif", "[c:097]");
        add(builder, "carton2017/098.png", "[c:098]");
        add(builder, "carton2017/099.png", "[c:099]");
        add(builder, "carton2017/100.png", "[c:100]");
        add(builder, "carton2017/101.png", "[c:101]");
        add(builder, "carton2017/102.png", "[c:102]");
        add(builder, "carton2017/103.png", "[c:103]");
        add(builder, "carton2017/104.png", "[c:104]");
        add(builder, "carton2017/105.png", "[c:105]");
        add(builder, "carton2017/106.png", "[c:106]");
        add(builder, "carton2017/107.png", "[c:107]");
        add(builder, "carton2017/108.png", "[c:108]");
        add(builder, "carton2017/109.png", "[c:109]");
        add(builder, "carton2017/110.png", "[c:110]");
        add(builder, "carton2017/111.png", "[c:111]");
        add(builder, "carton2017/112.png", "[c:112]");
        add(builder, "carton2017/113.png", "[c:113]");
        add(builder, "carton2017/114.gif", "[c:114]");
        add(builder, "carton2017/115.png", "[c:115]");
        add(builder, "carton2017/116.png", "[c:116]");
        add(builder, "carton2017/117.png", "[c:117]");
        add(builder, "carton2017/118.png", "[c:118]");
        add(builder, "carton2017/119.png", "[c:119]");
        add(builder, "carton2017/120.png", "[c:120]");
        add(builder, "carton2017/121.png", "[c:121]");
        add(builder, "carton2017/122.png", "[c:122]");
        add(builder, "carton2017/123.png", "[c:123]");
        add(builder, "carton2017/124.png", "[c:124]");
        add(builder, "carton2017/125.png", "[c:125]");
        add(builder, "carton2017/126.png", "[c:126]");
        add(builder, "carton2017/127.png", "[c:127]");
        add(builder, "carton2017/128.png", "[c:128]");
        add(builder, "carton2017/129.png", "[c:129]");
        add(builder, "carton2017/130.png", "[c:130]");
        add(builder, "carton2017/131.png", "[c:131]");
        add(builder, "carton2017/132.png", "[c:132]");
        add(builder, "carton2017/133.png", "[c:133]");
        add(builder, "carton2017/134.png", "[c:134]");
        add(builder, "carton2017/135.png", "[c:135]");
        add(builder, "carton2017/136.png", "[c:136]");
        add(builder, "carton2017/137.png", "[c:137]");
        add(builder, "carton2017/138.png", "[c:138]");
        add(builder, "carton2017/139.png", "[c:139]");
        add(builder, "carton2017/140.png", "[c:140]");
        add(builder, "carton2017/141.png", "[c:141]");
        add(builder, "carton2017/142.png", "[c:142]");
        add(builder, "carton2017/143.png", "[c:143]");
        add(builder, "carton2017/144.png", "[c:144]");
        add(builder, "carton2017/145.png", "[c:145]");
        add(builder, "carton2017/146.png", "[c:146]");
        add(builder, "carton2017/147.png", "[c:147]");
        add(builder, "carton2017/148.png", "[c:148]");
        add(builder, "carton2017/149.png", "[c:149]");
        add(builder, "carton2017/150.png", "[c:150]");
        add(builder, "carton2017/151.png", "[c:151]");
        add(builder, "carton2017/152.png", "[c:152]");
        add(builder, "carton2017/153.png", "[c:153]");
        add(builder, "carton2017/154.png", "[c:154]");
        add(builder, "carton2017/155.png", "[c:155]");
        add(builder, "carton2017/156.png", "[c:156]");
        add(builder, "carton2017/157.gif", "[c:157]");
        add(builder, "carton2017/158.gif", "[c:158]");
        add(builder, "carton2017/159.png", "[c:159]");
        add(builder, "carton2017/160.png", "[c:160]");
        add(builder, "carton2017/161.png", "[c:161]");
        add(builder, "carton2017/162.png", "[c:162]");
        add(builder, "carton2017/163.png", "[c:163]");
        add(builder, "carton2017/164.png", "[c:164]");
        add(builder, "carton2017/165.png", "[c:165]");
        add(builder, "carton2017/166.png", "[c:166]");
        add(builder, "carton2017/167.png", "[c:167]");
        add(builder, "carton2017/168.png", "[c:168]");
        add(builder, "carton2017/169.png", "[c:169]");
        add(builder, "carton2017/170.png", "[c:170]");
        add(builder, "carton2017/171.png", "[c:171]");
        add(builder, "carton2017/172.png", "[c:172]");
        add(builder, "carton2017/173.png", "[c:173]");
        add(builder, "carton2017/174.png", "[c:174]");
        add(builder, "carton2017/175.png", "[c:175]");
        add(builder, "carton2017/176.png", "[c:176]");
        add(builder, "carton2017/177.png", "[c:177]");
        add(builder, "carton2017/178.png", "[c:178]");
        add(builder, "carton2017/179.png", "[c:179]");
        add(builder, "carton2017/180.png", "[c:180]");
        add(builder, "carton2017/181.png", "[c:181]");
        add(builder, "carton2017/182.png", "[c:182]");
        add(builder, "carton2017/183.png", "[c:183]");
        add(builder, "carton2017/184.png", "[c:184]");
        add(builder, "carton2017/185.png", "[c:185]");
        add(builder, "carton2017/186.png", "[c:186]");
        add(builder, "carton2017/187.png", "[c:187]");
        add(builder, "carton2017/188.png", "[c:188]");
        add(builder, "carton2017/189.png", "[c:189]");
        add(builder, "carton2017/190.png", "[c:190]");
        add(builder, "carton2017/191.png", "[c:191]");
        add(builder, "carton2017/192.png", "[c:192]");
        add(builder, "carton2017/193.png", "[c:193]");
        add(builder, "carton2017/194.png", "[c:194]");
        add(builder, "carton2017/195.png", "[c:195]");
        add(builder, "carton2017/196.png", "[c:196]");
        add(builder, "carton2017/197.png", "[c:197]");
        add(builder, "carton2017/198.png", "[c:198]");
        add(builder, "carton2017/199.png", "[c:199]");
        add(builder, "carton2017/200.png", "[c:200]");
        add(builder, "carton2017/201.png", "[c:201]");
        add(builder, "carton2017/202.png", "[c:202]");
        add(builder, "carton2017/203.png", "[c:203]");
        add(builder, "carton2017/204.gif", "[c:204]");
        add(builder, "carton2017/205.png", "[c:205]");
        add(builder, "carton2017/206.png", "[c:206]");
        add(builder, "carton2017/207.png", "[c:207]");
        add(builder, "carton2017/208.png", "[c:208]");
        add(builder, "carton2017/209.png", "[c:209]");
        add(builder, "carton2017/210.png", "[c:210]");
        add(builder, "carton2017/211.png", "[c:211]");
        add(builder, "carton2017/212.png", "[c:212]");
        add(builder, "carton2017/213.png", "[c:213]");
        add(builder, "carton2017/214.png", "[c:214]");
        add(builder, "carton2017/215.gif", "[c:215]");
        add(builder, "carton2017/216.png", "[c:216]");
        add(builder, "carton2017/217.png", "[c:217]");
        add(builder, "carton2017/218.png", "[c:218]");
        add(builder, "carton2017/219.png", "[c:219]");
        add(builder, "carton2017/220.png", "[c:220]");
        add(builder, "carton2017/221.png", "[c:221]");
        add(builder, "carton2017/222.png", "[c:222]");
        return builder.build();
    }

    private List<Emoticon> getAnimalEmoticonList() {
        ImmutableList.Builder<Emoticon> builder = ImmutableList.builder();
        add(builder, "animal2017/001.png", "[a:001]");
        add(builder, "animal2017/002.png", "[a:002]");
        add(builder, "animal2017/003.png", "[a:003]");
        add(builder, "animal2017/004.png", "[a:004]");
        add(builder, "animal2017/005.png", "[a:005]");
        add(builder, "animal2017/006.png", "[a:006]");
        add(builder, "animal2017/007.png", "[a:007]");
        add(builder, "animal2017/008.png", "[a:008]");
        add(builder, "animal2017/009.png", "[a:009]");
        add(builder, "animal2017/010.png", "[a:010]");
        add(builder, "animal2017/011.png", "[a:011]");
        add(builder, "animal2017/012.png", "[a:012]");
        add(builder, "animal2017/013.png", "[a:013]");
        add(builder, "animal2017/014.png", "[a:014]");
        add(builder, "animal2017/015.png", "[a:015]");
        add(builder, "animal2017/016.png", "[a:016]");
        return builder.build();
    }

    private List<Emoticon> getDeviceEmoticonList() {
        ImmutableList.Builder<Emoticon> builder = ImmutableList.builder();
        add(builder, "device2017/001.png", "[d:001]");
        add(builder, "device2017/002.png", "[d:002]");
        add(builder, "device2017/003.png", "[d:003]");
        add(builder, "device2017/004.png", "[d:004]");
        add(builder, "device2017/005.png", "[d:005]");
        add(builder, "device2017/006.png", "[d:006]");
        add(builder, "device2017/007.png", "[d:007]");
        add(builder, "device2017/008.png", "[d:008]");
        add(builder, "device2017/009.png", "[d:009]");
        add(builder, "device2017/010.png", "[d:010]");
        add(builder, "device2017/011.png", "[d:011]");
        add(builder, "device2017/012.png", "[d:012]");
        add(builder, "device2017/013.png", "[d:013]");
        add(builder, "device2017/014.png", "[d:014]");
        add(builder, "device2017/015.png", "[d:015]");
        add(builder, "device2017/016.png", "[d:016]");
        add(builder, "device2017/017.gif", "[d:017]");
        add(builder, "device2017/018.png", "[d:018]");
        add(builder, "device2017/019.png", "[d:019]");
        add(builder, "device2017/020.png", "[d:020]");
        add(builder, "device2017/021.png", "[d:021]");
        add(builder, "device2017/022.png", "[d:022]");
        add(builder, "device2017/023.png", "[d:023]");
        add(builder, "device2017/024.png", "[d:024]");
        add(builder, "device2017/025.png", "[d:025]");
        add(builder, "device2017/026.png", "[d:026]");
        add(builder, "device2017/027.png", "[d:027]");
        add(builder, "device2017/028.png", "[d:028]");
        add(builder, "device2017/029.png", "[d:029]");
        add(builder, "device2017/030.png", "[d:030]");
        add(builder, "device2017/031.png", "[d:031]");
        add(builder, "device2017/032.png", "[d:032]");
        return builder.build();
    }

    private List<Emoticon> getGooseEmoticonList() {
        ImmutableList.Builder<Emoticon> builder = ImmutableList.builder();
        add(builder, "goose2017/001.png", "[g:001]");
        add(builder, "goose2017/002.png", "[g:002]");
        add(builder, "goose2017/003.png", "[g:003]");
        add(builder, "goose2017/004.png", "[g:004]");
        add(builder, "goose2017/005.png", "[g:005]");
        add(builder, "goose2017/006.png", "[g:006]");
        add(builder, "goose2017/007.png", "[g:007]");
        add(builder, "goose2017/008.png", "[g:008]");
        add(builder, "goose2017/009.png", "[g:009]");
        add(builder, "goose2017/010.png", "[g:010]");
        add(builder, "goose2017/011.png", "[g:011]");
        add(builder, "goose2017/012.png", "[g:012]");
        add(builder, "goose2017/013.png", "[g:013]");
        add(builder, "goose2017/014.png", "[g:014]");
        add(builder, "goose2017/015.png", "[g:015]");
        add(builder, "goose2017/016.png", "[g:016]");
        add(builder, "goose2017/017.png", "[g:017]");
        add(builder, "goose2017/018.png", "[g:018]");
        add(builder, "goose2017/019.png", "[g:019]");
        add(builder, "goose2017/020.png", "[g:020]");
        add(builder, "goose2017/021.png", "[g:021]");
        add(builder, "goose2017/022.png", "[g:022]");
        add(builder, "goose2017/023.png", "[g:023]");
        add(builder, "goose2017/024.png", "[g:024]");
        add(builder, "goose2017/025.png", "[g:025]");
        add(builder, "goose2017/026.png", "[g:026]");
        add(builder, "goose2017/027.png", "[g:027]");
        add(builder, "goose2017/028.png", "[g:028]");
        add(builder, "goose2017/029.png", "[g:029]");
        add(builder, "goose2017/030.png", "[g:030]");
        add(builder, "goose2017/031.png", "[g:031]");
        add(builder, "goose2017/032.png", "[g:032]");
        add(builder, "goose2017/033.png", "[g:033]");
        add(builder, "goose2017/034.png", "[g:034]");
        add(builder, "goose2017/035.png", "[g:035]");
        add(builder, "goose2017/036.png", "[g:036]");
        add(builder, "goose2017/037.png", "[g:037]");
        add(builder, "goose2017/038.png", "[g:038]");
        add(builder, "goose2017/039.png", "[g:039]");
        add(builder, "goose2017/040.png", "[g:040]");
        add(builder, "goose2017/041.png", "[g:041]");
        add(builder, "goose2017/042.png", "[g:042]");
        add(builder, "goose2017/043.png", "[g:043]");
        add(builder, "goose2017/044.png", "[g:044]");
        add(builder, "goose2017/045.png", "[g:045]");
        add(builder, "goose2017/046.png", "[g:046]");
        add(builder, "goose2017/047.png", "[g:047]");
        add(builder, "goose2017/048.png", "[g:048]");
        add(builder, "goose2017/049.png", "[g:049]");
        add(builder, "goose2017/050.png", "[g:050]");
        add(builder, "goose2017/051.png", "[g:051]");
        add(builder, "goose2017/052.png", "[g:052]");
        add(builder, "goose2017/053.png", "[g:053]");
        add(builder, "goose2017/054.png", "[g:054]");
        add(builder, "goose2017/055.png", "[g:055]");
        add(builder, "goose2017/056.png", "[g:056]");
        add(builder, "goose2017/057.png", "[g:057]");
        add(builder, "goose2017/058.png", "[g:058]");
        add(builder, "goose2017/059.png", "[g:059]");
        add(builder, "goose2017/060.png", "[g:060]");
        add(builder, "goose2017/061.png", "[g:061]");
        add(builder, "goose2017/062.png", "[g:062]");
        add(builder, "goose2017/063.png", "[g:063]");
        add(builder, "goose2017/064.png", "[g:064]");
        add(builder, "goose2017/065.png", "[g:065]");
        add(builder, "goose2017/066.png", "[g:066]");
        add(builder, "goose2017/067.png", "[g:067]");
        add(builder, "goose2017/068.png", "[g:068]");
        add(builder, "goose2017/069.png", "[g:069]");
        add(builder, "goose2017/070.png", "[g:070]");
        add(builder, "goose2017/071.png", "[g:071]");
        add(builder, "goose2017/072.png", "[g:072]");
        add(builder, "goose2017/073.png", "[g:073]");
        add(builder, "goose2017/074.png", "[g:074]");
        return builder.build();
    }

    private List<Emoticon> getBundamEmoticonList() {
        ImmutableList.Builder<Emoticon> builder = ImmutableList.builder();
        add(builder, "bundam2017/001.png", "[b:001]");
        add(builder, "bundam2017/002.png", "[b:002]");
        add(builder, "bundam2017/003.png", "[b:003]");
        add(builder, "bundam2017/004.png", "[b:004]");
        add(builder, "bundam2017/005.png", "[b:005]");
        add(builder, "bundam2017/006.png", "[b:006]");
        add(builder, "bundam2017/007.png", "[b:007]");
        add(builder, "bundam2017/008.png", "[b:008]");
        add(builder, "bundam2017/009.png", "[b:009]");
        add(builder, "bundam2017/010.png", "[b:010]");
        add(builder, "bundam2017/011.png", "[b:011]");
        add(builder, "bundam2017/012.png", "[b:012]");
        add(builder, "bundam2017/013.png", "[b:013]");
        add(builder, "bundam2017/014.png", "[b:014]");
        add(builder, "bundam2017/015.png", "[b:015]");
        add(builder, "bundam2017/016.png", "[b:016]");
        add(builder, "bundam2017/017.png", "[b:017]");
        add(builder, "bundam2017/018.png", "[b:018]");
        add(builder, "bundam2017/019.png", "[b:019]");
        add(builder, "bundam2017/020.png", "[b:020]");
        add(builder, "bundam2017/021.png", "[b:021]");
        add(builder, "bundam2017/022.png", "[b:022]");
        add(builder, "bundam2017/023.png", "[b:023]");
        add(builder, "bundam2017/024.png", "[b:024]");
        add(builder, "bundam2017/025.png", "[b:025]");
        add(builder, "bundam2017/026.png", "[b:026]");
        add(builder, "bundam2017/027.png", "[b:027]");
        add(builder, "bundam2017/028.png", "[b:028]");
        add(builder, "bundam2017/029.png", "[b:029]");
        add(builder, "bundam2017/030.png", "[b:030]");
        add(builder, "bundam2017/031.png", "[b:031]");
        add(builder, "bundam2017/032.png", "[b:032]");
        add(builder, "bundam2017/033.png", "[b:033]");
        add(builder, "bundam2017/034.png", "[b:034]");
        add(builder, "bundam2017/035.png", "[b:035]");
        add(builder, "bundam2017/036.png", "[b:036]");
        return builder.build();
    }

    private void add(ImmutableList.Builder<Emoticon> builder, String emoticonFileName, String emoticonEntity) {
        builder.add(new Emoticon(ASSET_PATH_EMOTICON + emoticonFileName, emoticonEntity));
    }
}
