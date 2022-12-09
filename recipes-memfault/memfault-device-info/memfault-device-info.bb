DESCRIPTION = "memfault-device-info application"
LICENSE = "CLOSED"

S = "${WORKDIR}"

do_compile() {
    echo "#!/bin/sh" > ${S}/memfault-device-info
    echo "echo MEMFAULT_DEVICE_ID=test-unit" >> ${S}/memfault-device-info
    echo "echo MEMFAULT_HARDWARE_VERSION=rpi3b" >> ${S}/memfault-device-info
}

do_install() {
    install -Dm 755 ${S}/memfault-device-info ${D}/${bindir}/memfault-device-info
}
