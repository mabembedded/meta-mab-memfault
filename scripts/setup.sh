#!/bin/bash
build_dir=$1

if [ -z "$build_dir" ]; then
	build_dir=build-memfault-rpi
fi

TEMPLATECONF="$PWD/sources/meta-memfault-rpi/conf" source sources/poky/oe-init-build-env $build_dir
