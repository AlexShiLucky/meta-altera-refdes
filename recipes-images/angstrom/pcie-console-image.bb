require recipes-images/angstrom/extended-console-image.bb

IMAGE_INSTALL += "pciutils dmaxfer-altera \
			pcie-benchmark-altera-module fio \
			e2fsprogs \
"
export IMAGE_BASENAME = "pcie-console-image"

