// Command building section
if (assetIndex != null) {
    cmd.add("--assetIndex");
    cmd.add(assetIndex);
}
// Adding userProperties parameter for version 1.7.10
cmd.add("--userProperties");
cmd.add("{}");
// Other command building lines