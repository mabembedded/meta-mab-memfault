SUMMARY = "Create mount point for data"
LICENSE = "CLOSED"

do_install() {
    install -d ${D}/data
}

FILES_${PN} += "/data"
