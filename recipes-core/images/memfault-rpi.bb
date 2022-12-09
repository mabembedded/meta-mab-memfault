DESCRIPTION = "Memfault RPi test image"

IMAGE_FSTYPES += "wic"
IMAGE_FEATURES += "ssh-server-openssh"
WKS_FILE = "memfault-rpi.wks"

inherit core-image

IMAGE_INSTALL += "\
	memfault-device-info \
	u-boot-env \
	u-boot-fw-utils \
	data-mount \
"
