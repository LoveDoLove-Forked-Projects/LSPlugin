plugins {
    id("LSPlugin")
}

subprojects {
    group = "org.lsposed.lsplugin"
}
tasks.named<UpdateDaemonJvm>("updateDaemonJvm") {
    languageVersion = JavaLanguageVersion.of(21)
    vendor = JvmVendorSpec.ADOPTIUM
}
